(ns card-game.core-test
  (:use clojure.test
        card-game.core))

(deftest case-1
  (testing "should return 30 for the first case"
    (is (= 30 (calculate-average 4 3 [3 6 2 8])))))

(deftest case-2
  (testing "should return 400 for the second case"
    (is (= 400 (calculate-average 5 2 [10 20 30 40 50])))))


(deftest case-3
  (testing "should return 103 for the third case"
    (is (= 103 (calculate-average 6 4 [ 0 1 2 3 5 8])))))


(deftest case-4
  (testing "should return 1122 for the fourth case"
    (is (= 1122 (calculate-average 2 2 [1069 1122])))))

(deftest case-5
  (testing "should return 2621483 for the fifth case"
    (is (= 2621483 (calculate-average 10 5 [10386 10257 10432 10087 10381 10035 10167 10206 10347 10088])))))
