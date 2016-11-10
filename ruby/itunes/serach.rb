#!/usr/bin/env ruby
require 'itunes-search-api'
require 'mongo'
require './config/config'

connect = Mongo::Connection.new(MONGO_CONNECT)
db = connect.db('test_data')
collect = db.collection('movie_data')

ITunesSearchAPI.search(
  term: "石原さとみ",
  country: "jp",
  media: "movie",
  lang: "ja_jp",
  limit: "500"
).each do |item|
  collect.insert(item)
end
