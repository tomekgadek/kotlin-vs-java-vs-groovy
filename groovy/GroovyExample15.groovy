/** Mapy */

def matrix = [100 : "Neo", 200 : "Morfeusz", 300 : "Trinity", 400 : "Apoc"]

println("Team size: " + matrix.size())

println("Find by key: " + matrix.get(200))
println("Find by key: " + matrix.get(0))

matrix.each { key, value -> println "$key : $value" }
