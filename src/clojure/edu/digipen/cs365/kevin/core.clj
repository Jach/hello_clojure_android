(ns edu.digipen.cs365.kevin.core
  (:gen-class :extends android.app.Activity
              :main false
              :exposes-methods {onCreate superOnCreate})
  )

(defn -onCreate
  "Called when the activity is initialised."
  [this #^android.os.Bundle savedInstanceState]
  (doto this
    (.superOnCreate savedInstanceState)
    (.setContentView edu.digipen.cs365.kevin.R$layout/main))
  (let [tv (new android.widget.TextView this)]
    (.setText tv "Hello Android from Clojure!")
    (.setContentView this tv))
  )
