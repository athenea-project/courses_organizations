import json
import pymongo

connection = pymongo.MongoClient("localhost:27017")
db=connection.athenea
record1 = db.courses_collection
page = open("data.json", 'r')
parsed = json.loads(page.read())

for item in parsed["Records"]:
    record1.insert(item)

