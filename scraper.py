import feedparser, json, pymongo

d = feedparser.parse('http://www.spri.eus/euskadinnova/modulos/RSSGenerar.aspx?language=es&tematica=2,3,4,5&tipo=2')
connection = pymongo.MongoClient("localhost:27017")
db = client.athenea
collection = db.courses_organizations
#cursos = []

for post in d.entries:
    if post.title[0:7] != 'JORNADA':
        c_new = {'title' : post.title , 'description' : post.description.split('</p>')[0], 'date' : (post.description.split('Fecha: <strong>')[1]).split('</strong>')[0], 'place' : (post.description.split('Lugar: <strong>')[1]).split('</strong>')[0]}
        collection.insert_one(c_new)
        cursos.append(c_new)
    pass

#with open('test.json', mode='w', encoding='utf-8') as feedsjson:
    #entry = {'name': args.name, 'url': args.url}
    #json.dump(cursos, feedsjson)
