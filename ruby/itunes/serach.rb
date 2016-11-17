#!/usr/bin/env ruby
require 'itunes-search-api'
# require 'hashie'

# require 'mongo'
# require './config/config'

# connect = Mongo::Connection.new(MONGO_CONNECT)
# db = connect.db(DB)
word = ARGV[0]

ITunesSearchAPI.search(
  term: "#{word}",
  country: "jp",
  media: "movie",
  lang: "ja_jp",
#   limit: "100"
).each do |item|
  puts "#{word} #{item["artistName"]} #{item["trackName"].gsub(/\s/,"")} #{item["trackCensoredName"].gsub(/\s/,"")} #{item["artworkUrl60"]} #{item["longDescription"].gsub(/\s/,"")}"
end
