(ns cljs.lean-map.test.collection-check
  (:require [cljs.test :refer-macros [deftest]]
            [collection-check.core :as cc]
            [clojure.test.check.generators :as gen]
            [cljs.lean-map.core :as lean-map.core])
  (:refer-clojure :exclude [PersistentHashMap]))

(deftest assert-cljs-core-map-like
  #_(cc/assert-map-like 100 (.-EMPTY cljs.core/PersistentHashMap) (gen/tuple gen/int) (gen/tuple gen/int)))

(deftest assert-lean-map-core-map-like
  (cc/assert-map-like 100 (.-EMPTY lean-map.core/PersistentHashMap) (gen/tuple gen/int) (gen/tuple gen/int)))
