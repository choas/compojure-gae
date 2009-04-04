(ns test.run
  (:use clojure.contrib.test-is)
  (:require test.compojure.html.gen)
  (:require test.compojure.html.form-helpers)
  (:require test.compojure.http.routes))

(run-tests 
  'test.compojure.html.gen
  'test.compojure.html.form-helpers
  'test.compojure.http.routes)