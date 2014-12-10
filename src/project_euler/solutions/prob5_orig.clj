(ns project_euler.solutions.prob5_orig)

(defn lcm
  "The smallest number evenly divisible by a and b"
  [a b]
  (letfn [(least-common
            [[x y]]
            (if (= x y)
              [x y]
              (if (< x y)
                [(+ a x) y]
                [x (+ b y)])))]
    (->> [a b]
         (iterate least-common)
         (take-while #(not (= (first %) (second %))))
         (last)
         (apply max))))

(defn answer
  []
  (reduce lcm (range 1 21)))