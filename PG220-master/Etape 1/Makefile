ALL: default 

CC= javac



SHELL = /bin/sh


EXECS = Client.class ClientOrder.class Date.class Order.class Panel.class Plank.class Price.class Size.class Supplier.class SupplierOrder.class mov clean2

default: $(EXECS)

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


Panel.class: Panel.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/


Plank.class: Plank.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/


Supplier.class: Supplier.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	#!@-mv $@ ./bin/


SupplierOrder.class: SupplierOrder.java
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
