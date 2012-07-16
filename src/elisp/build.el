(load-library "clojure-mode")
(load-library "htmlize")
(load-library "org")

(org-version)

(setq make-backup-files nil)
(setq org-export-htmlize-output-type 'css)
(setq org-src-fontify-natively t)
(setq font-lock-verbose nil)
(setq enable-local-variables :all)

(find-file "src/org/index.org")
(org-export-as-html nil)
