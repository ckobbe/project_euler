(ns project_euler.test_solutions.prob6
  (:use clojure.test
        project_euler.solutions.prob6))

(deftest answer?
  (let [a (answer)]
    (is (not (nil? a)))
    (is (integer? a))))

(deftest squares-summed-test
  (is (= 385 (squares-summed 10))))

(deftest sum-squared-test
  (is (= 3025 (sum-squared 10))))

(deftest difference-test
  (is (= 2640 (- (sum-squared 10) (squares-summed 10)))))




