ALL: default 

CC= javac



SHELL = /bin/sh


EXECS = Validable.class Client.class ClientOrder.class Date.class Order.class Plank.class Price.class Size.class ReadXml.class Reader.class mov clean2

default: $(EXECS)

Validable.class: Validable.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/

Reader.class: Reader.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/

ReadXml.class: ReadXml.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/

Client.class: Client.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/
	
	
ClientOrder.class: ClientOrder.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/

Date.class: Date.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/


Order.class: Order.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/


Plank.class: Plank.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/






Price.class: Price.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/
	

Size.class: Size.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/

clean:
	@-/bin/rm -f *.o *~ PI* $(EXECS) *.out core 

clean2:
	@-rm -f *.o *~ PI* $(EXECS) *.out core

mov:
	@-mv $(EXECS) ./bin/

veryclean: clean
	@-/bin/rm -f ./bin/*
	@-/bin/rmdir ./bin

.java:
	$(CC) $* $<
