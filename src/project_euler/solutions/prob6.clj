(ns project_euler.solutions.prob6)

(defn squares-summed
  [n]
  (apply + (map #(* % %) (range 1 (inc n)))))

(defn sum-squared
  [n]
  (#(* % %) (apply + (range 1 (inc n)))))

(defn answer
  []
  (let [extent 100]
    (- (sum-squared extent) (squares-summed extent))))