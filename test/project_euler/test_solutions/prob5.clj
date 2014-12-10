(ns project_euler.test_solutions.prob5
  (:use clojure.test
        project_euler.solutions.prob5))

(deftest answer?
  (let [a (answer)]
    (is (not (nil? a)))
    (is (integer? a))))

(deftest lcm-test
  (is (= 6 (lcm 2 3)))
  (is (= 6 (lcm 6 3)))
  (is (= 2520 (reduce lcm (range 1 11)))))




