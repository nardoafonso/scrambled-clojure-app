(ns tutorial.core-test
  (:require [clojure.test :refer :all]
            [tutorial.core :refer :all]))


(deftest test-scramble?
  (testing "dont contain word" 
    (is (scrambled? "rekqodlw" "world"))
    (is (scrambled? "cedewaraaossoqqyt" "codewars"))
    (is (not (scrambled? "katas" "steak"))  )  
  )
)
