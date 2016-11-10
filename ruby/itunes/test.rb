require 'mongo'
require './config/config'

connect = Mongo::Connection.new(MONGO_CONNECT)
db = connect.db(DB)
collect = db.collection(COLLECTION)

puts collect.find_one
