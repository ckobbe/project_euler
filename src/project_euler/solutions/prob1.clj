(ns project_euler.solutions.prob1)

(defn mod3-or-5?
  [x]
  (when (or (= 0 (mod x 3)) (= 0 (mod x 5)))
    true))

(defn sum-for
  [x]
  (reduce + (filter mod3-or-5? (range 1 x))))

(defn answer
  "Whatever"
  []
   (sum-for 1000))