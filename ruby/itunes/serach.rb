#!/usr/bin/env ruby
require 'itunes-search-api'
require 'mongo'
require './config/config'

connect = Mongo::Connection.new(MONGO_CONNECT)
db = connect.db(DB)
collect = db.collection(COLLECTION)

ITunesSearchAPI.search(
  term: "石原さとみ",
  country: "jp",
  media: "movie",
  lang: "ja_jp",
  limit: "500"
).each do |item|
  collect.insert(item)
end
