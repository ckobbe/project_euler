(ns project_euler.test_solutions.prob2
  (:use clojure.test
        project_euler.solutions.prob2))

(deftest answer?
  (let [a (answer)]
    (is (not (nil? a)))
    (is (integer? a))))

(deftest fibonacci-test
  (is (= [1 2 3 5 8 13 21 34 55 89] (vec (take 10 (fibonacci))))))
