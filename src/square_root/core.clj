(ns square-root.core
	(:gen-class))

(defn abs [n] (max n (- n)))

(defn good-enough? [guess x]
	(< (abs (- (* guess guess) x)) 0.001))

(defn avg [a b]
	(/ (+ a b) 2))

(defn sqrt [guess x]
	(if (good-enough? guess x)
		guess
		(sqrt (avg guess (/ x guess)) x)))

(defn -main
	[& args]
	(println (sqrt 1.0 4))
	(println (sqrt 2.0 4))
	(println (sqrt 8.0 16))
	(println (sqrt 1.0 1))
	(println (sqrt 3.0 4)))