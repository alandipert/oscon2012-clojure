(ns tutorial.midi
  (:import (javax.sound.midi MidiSystem Synthesizer)))

(def notes
  [{:note 60 :duration 1}
   {:note 62 :duration 1}
   {:note 64 :duration 1}
   {:note 60 :duration 1}
   {:note 60 :duration 1}
   {:note 62 :duration 1}
   {:note 64 :duration 1}
   {:note 60 :duration 1}
   {:note 64 :duration 1}
   {:note 65 :duration 1}
   {:note 67 :duration 2}
   {:note 64 :duration 1}
   {:note 65 :duration 1}
   {:note 67 :duration 2}])

(defn play-a-note [note velocity duration]
  (with-open [synth (doto (MidiSystem/getSynthesizer) .open)]
    (let [channel (aget (.getChannels synth) 0)]
      (.noteOn channel note velocity)
      (Thread/sleep duration)
      (.noteOff channel note))))

(play-a-note 60 127 3000)

