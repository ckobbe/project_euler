(ns project_euler.solutions.prob3)

(defn factors-lt-sqrt
  [x]
  (filter #(= 0 (mod x %)) (take-while #(<= (* % %) x) (iterate inc 2))))

(defn prime?
  [x]
  (= 0 (count (factors-lt-sqrt x))))

(defn prime-factors
  [x]
  (filter prime? (factors-lt-sqrt x)))

(defn answer
  []
  (reduce max (prime-factors 600851475143)))