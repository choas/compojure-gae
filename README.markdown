# compojure-gae 
## compojure for google app engine - out of the box

forked [cemerick / compojure](http://github.com/cemerick/compojure) (April 18th 2010); a compojure 0.3.3 

Compojure is an open source web framework for the [Clojure](http://clojure.org) programming language. It emphasizes a thin I/O layer and a functional approach to web development.

#### What differs from the forked version?
The forked version includes multipart with FileUpload. This causes on google app engine an error: java.rmi.server.UID is a restricted class.

Alternatively, you can use a "normal" compojure and define the compojure.http usage more specific:
    (:use [compojure.http servlet routes helpers])

#### What happened with build.xml?
"And now I’m ready for anything and everything – including your ants." -- Leiningen Versus the Ants by Carl Stephenson

Leiningen can do anything and everything:
    lein jar

#### Yes, fine, but how can I use it?
Just add this in your project.clj file under :dependencies
    [compojure-gae "0.3.3"]

The jar file is hosted by [Clojars.org](http://clojars.org/compojure-gae).

#### Why not compojure 0.4.x?
Compojure 0.4.x uses ring as library and therefore another different namespace is required.


Sample Code
-----------

Here's a small web application written in Compojure:

    (use 'compojure)

    (defroutes my-app
      (GET "/"
        (html [:h1 "Hello World"]))
      (ANY "*"
        (page-not-found)))

    (run-server {:port 8080}
      "/*" (servlet my-app))

Dependencies
------------

To run Compojure, you'll need:

* The [Clojure](http://clojure.org) programming language
* The [Clojure-Contrib](http://code.google.com/p/clojure-contrib/) library
* A Java servlet container like [Jetty](http://www.mortbay.org/jetty/)
* Apache Commons [IO](http://commons.apache.org/io) and
  [Codec](http://commons.apache.org/codec).

These dependencies can be downloaded automatically using:

    ant deps

Documentation
-------------

For information on how to get started and use Compojure, please see our
[Wiki](http://en.wikibooks.org/wiki/Compojure).

There is also a rough draft of a [Compojure Tutorial](http://groups.google.com/group/compojure/browse_thread/thread/3c507da23540da6e)
available to read.

Community
---------

The [Compojure Group](http://groups.google.com/group/compojure) is the best place
to ask questions about Compojure, suggest improvements or to report bugs.

Tutorials
---------

Eric Lavigne has written a series of excellent tutorials on Compojure:

* [Install Compojure on a Slicehost VPS](http://ericlavigne.wordpress.com/2008/12/18/compojure-on-a-slicehost-vps/)
* [Using PostgreSQL with Compojure](http://ericlavigne.wordpress.com/2008/12/28/using-postgresql-with-compojure/)
* [Compojure security: authentication and authorization](http://ericlavigne.wordpress.com/2009/01/04/compojure-security-authentication-and-authorization/)

John Hume has written about: 
* [Clojure on Google AppEngine](http://elhumidor.blogspot.com/2009/04/clojure-on-google-appengine.html)
