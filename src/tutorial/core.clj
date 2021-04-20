(ns tutorial.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defn scrambled? [s,w]
  (try
    (every? true? (vec (for [x (frequencies w)] (>= (get (frequencies s) (key x))(val x)))))  
    (catch Exception e false)
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println 
    ( str [
      (scrambled? "rekqodlw" "world"),
      (scrambled? "cedewaraaossoqqyt" "codewars"),
      (scrambled? "abcdefghijklmnopqrstuvwxyzl" "umbrella"),
      (scrambled? "aaabbbcccc" "aabccc"),
      (scrambled? "aaabbbccc" "aaaabcccc"),
      (scrambled? "katas" "steak")
    ])  
  )
)