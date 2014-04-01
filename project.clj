(defproject atw-om/lein-template "0.1.7"
  :description "Clojure, all the way with Om"
  :url "https://github.com/zaiste/atw-om"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/zaiste/atw-om"}
  :signing {:gpg-key "oh@zaiste.net"}
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :eval-in-leiningen true)
