(ns project_euler.solutions.prob2)

(defn fibonacci
  "returns a lazy seq of Fibonacci numbers"
  []
  (letfn [(fib [[x y]] [y (+' x y)])]
    (map first (iterate fib [1 2]))))

(defn answer
  []
  (reduce + (filter even? (take-while #(< % 4000001) (fibonacci)))))