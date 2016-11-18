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
  puts "#{word}\t#{item["artistName"]}\t#{item["trackName"]}\t#{item["trackCensoredName"]}\t#{item["artworkUrl60"]}\t#{item["longDescription"].gsub(/\n/,"")}"
end
