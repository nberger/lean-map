(ns cljs.lean-map.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [cljs.lean-map.test.collection-check]
              [cljs.lean-map.test.core]))

(doo-tests 'cljs.lean-map.test.collection-check
           'cljs.lean-map.test.core)
