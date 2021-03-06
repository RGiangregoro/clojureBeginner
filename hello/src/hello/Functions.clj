(ns hello.Functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My name is Ralph")
  (println "Clojure practice")
  (+ 2 5))

#(println "Hello" %)

(def increment (fn [x] (+ x 1)))

(defn incrementSet
  [x]
  (map increment x))

(defn DataTypes []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12)
  (def d 0xfbfc)
  (def e nil)
  (def f true)
  (def g "Hello")

  (def status true)
  (def STATUS false)

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println g)
  (println status)
  (println STATUS)
  )
(DataTypes)