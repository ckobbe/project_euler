(ns project_euler.test_solutions.prob7
  (:use clojure.test
        project_euler.solutions.prob7
        [project_euler.solutions.prob3 :only (prime?)]))

(deftest answer?
  (let [a (answer)]
    (is (not (nil? a)))
    (is (integer? a))))

(deftest prime-test
  (is (prime? 3))
  (is (not (prime? 8)))
  (is (= 13 (last (take 6 (primes))))))



