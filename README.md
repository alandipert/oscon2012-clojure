OSCON 2012 Clojure Tutorial

Developer Bootstrap
========================================

You will need the following:

* [Emacs](http://www.gnu.org/software/emacs/) version 23+
  * To check which version you have, type `M-x emacs-version`
* Bash
* Git

Download additional dependencies by running:

    script/bootstrap


Building
========================================

Run:

    script/build

Open the HTML file `src/org/index.html` in a web browser and
type `t` to start the presentation.


Building for Distribution
-------------------------

You can build a ZIP file for distribution to students that includes
the slides. Run these commands:

    script/clean
    script/build
    script/package

The ZIP file will be in `out/`.


Exporting from Emacs
========================================

Optionally, you can run the HTML export directly from Emacs.

Note: Code syntax highlighting will use your current Emacs color
theme, which may not look good on slides with a white background.

You will need the following:

* [Org-mode](http://orgmode.org/) version 7+
  * To check which version you have, open an .org file and type `M-x org-version`
* [clojure-mode](https://github.com/technomancy/clojure-mode) latest version
* [htmlize](http://www.emacswiki.org/emacs/Htmlize) latest version

In Emacs, open the file `src/org/index.org`. If you are
prompted about local variables, type `!`. Type `C-c C-e h` to export
the HTML.

Org-mode Hints
========================================

See `lib/org-html-slides/README.md` for more information about
controlling and formatting the presentation.

Each slide must be an org-mode headline, at level 1 or 2, with the
`:slide:` tag.

Add this line somewhere in your .org file:

    #+TAGS: slide(s)

then you can type `C-c C-c s RET` on a headline to quickly add the :slide: tag.


Source Code
--------------------

Create code blocks like this:

    #+begin_src clojure
      (println "Hello, world!")
    #+end_src

With the cursor on a code block, type `C-c '` (Control-C then
single-quote) to edit the block in the correct mode.

Type `<s` and press TAB at the beginning of a line to insert a
begin_src/end_src block.


Testing
--------------------

The [Window Resizer](https://chrome.google.com/webstore/detail/kkelicaakdanhinjdeammmilcgefonfh)
extension for Google Chrome can simulate various screen resolutions.