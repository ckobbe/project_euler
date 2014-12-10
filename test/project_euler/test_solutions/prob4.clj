(ns project_euler.test_solutions.prob4
  (:use clojure.test
        project_euler.solutions.prob4))

(deftest answer?
  (let [a (answer)]
    (is (not (nil? a)))
    (is (integer? a))))

(deftest palindrome
  (is (palindrome? 9009))
  (is (not (palindrome? (* 92 99)))))

(deftest product
  (is (= 9009 (largest-palindrome-product 10 100))))




