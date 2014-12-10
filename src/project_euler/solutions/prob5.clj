(ns project_euler.solutions.prob5)

(defn gcd
  [a b]
  (cond
   (= a b) a
   (< a b) (recur (- b a) a)
   :else (recur (- a b) b)))

(defn lcm
  "The smallest number evenly divisible by a and b"
  [a b]
  (/ (* a b) (gcd a b)))

(defn answer
  []
  (reduce lcm (range 1 21)))