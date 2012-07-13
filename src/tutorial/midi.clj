(ns tutorial.midi
  (:import (javax.sound.midi MidiSystem Synthesizer)))

(defn play-a-note [note velocity duration]
  (with-open [synth (doto (MidiSystem/getSynthesizer) .open)]
    (let [channel (aget (.getChannels synth) 0)]
      (.noteOn channel note velocity)
      (Thread/sleep duration))))

(play-a-note 60 127 3000)


(defn play
  ([note] (play note 2))
  ([note duration] (play-a-note note 127 (* 200 duration))))

(def notes
  [52 54 56 52 52 54 56 52 56 57 [59 1] 56 57 [59 1] [59 4] [61 4] [59 4] [57 4]
   56 52 [59 4] [61 4] [59 4] [57 4] 56 52 52 47 [52 1] 52 47 [52 1]])

(doseq [note notes]
  (if (vector? note)
    (apply play note)
    (play note)))

(vector? [1 2])