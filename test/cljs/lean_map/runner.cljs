(ns cljs.lean-map.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [cljs.lean-map.test.collection-check]))

(doo-tests 'cljs.lean-map.test.collection-check)
