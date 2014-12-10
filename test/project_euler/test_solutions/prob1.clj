(ns project_euler.test_solutions.prob1
  (:use clojure.test
        project_euler.solutions.prob1))

(deftest answer?
  (let [a (answer)]
    (is (not (nil? a)))
    (is (integer? a))))

(deftest test-filter
  (is (mod3-or-5? 3))
  (is (not (mod3-or-5? 4))))

(deftest test-sum
  (is (= 23 (sum-for 10))))