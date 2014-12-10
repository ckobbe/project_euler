(ns project_euler.solutions.prob7
  (:use [project_euler.solutions.prob3 :only (prime?)]))

(defn primes
  []
  (filter prime? (iterate inc 2)))

(defn answer
  []
  (last (take 10001 (primes))))