(ns project_euler.test_solutions.prob3
  (:use clojure.test
        project_euler.solutions.prob3))

(deftest answer?
  (let [a (answer)]
    (is (not (nil? a)))
    (is (integer? a))))

(deftest primes
  (is (prime? 3))
  (is (not (prime? 8))))

(deftest factors
  (is (= [5 7 13 29] (vec (prime-factors 13195)))))


