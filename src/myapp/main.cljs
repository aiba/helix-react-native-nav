(ns myapp.main
  (:require ["react-native" :as rn]
            [myapp.nav :as nav]
            [helix.core :refer [defnc $]]
            [helix.experimental.refresh :as refresh]))

(refresh/inject-hook!)

(defn ^:dev/after-load after-load []
  (refresh/refresh!))

(defn init []
  (rn/AppRegistry.registerComponent "MyApp" (fn [] nav/NavRoot)))
