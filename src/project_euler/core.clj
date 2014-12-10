(ns project_euler.core)

(defn -main
  "Execute a solution for one or more problems"
  [& args]
  (doseq [s args]
    (let [n (symbol (str "project_euler.solutions." s))]
      (try 
        (require n)
        (println (str s ": " (eval (list (symbol (str n "/answer"))))))
        (catch Exception e
          (println (str "Nothing found in solutions for " s)))))))