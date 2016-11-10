require 'mongo'
require './config/config'

connect = Mongo::Connection.new(MONGO_CONNECT)
db = connect.db('test_data')
collect = db.collection('movie_data')

puts collect.find_one
