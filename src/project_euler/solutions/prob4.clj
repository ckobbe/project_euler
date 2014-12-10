(ns project_euler.solutions.prob4)

(defn palindrome?
  [x]
  (let [chars (seq (str x))]
    (= chars (reverse chars))))

(defn largest-palindrome-product
  [lo hi]
  (reduce max
   (filter palindrome?
           (for [a (range lo hi)
                 b (range a hi)]
             (* a b)))))

(defn answer
  []
  (largest-palindrome-product 100 1000))