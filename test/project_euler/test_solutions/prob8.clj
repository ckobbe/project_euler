(ns project_euler.test_solutions.prob8
  (:use clojure.test
        project_euler.solutions.prob8))

(deftest answer?
  (let [a (answer)]
    (is (not (nil? a)))
    (is (integer? a))))

(deftest char2int
  (is (= 2 (parse \2))))



