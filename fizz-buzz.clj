(defn fizz-buzz
  "Infinite fizz buzz. Take what you need"
  []
  (let [threes (cycle ["" "" "Fizz"])
        fives  (cycle ["" "" "" "" "Buzz"])
        buzzer (fn [s1 s2 n]
                 (if (= "" s1 s2)
                   (str n)
                   (str s1 s2)))]
    (map buzzer threes fives (iterate inc 1))))

;; (doseq [x (take 15 (fizz-buzz))]
;;    (prn x))