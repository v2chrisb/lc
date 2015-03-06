; Using Horstmann's Java book exercises and trying to do them in Clojure.
; This is my attempt at working on "an algorithm a day."
; Chris Beattie, 3/5/15
(ns yrs-2-dbl-balance
  (:gen-class))

; Integer->Integer->Integer
; Calculate balance * interest + balance until balance is >= 20000

(defn balint 
    
    [bal int]
    (+ bal (* bal int)))
