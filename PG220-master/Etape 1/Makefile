ALL: default 

CC= javac



SHELL = /bin/sh


EXECS = Client.class ClientOrder.class Date.java Order.class Panel.class Plank.class Prix.class Size.class Supplier.class SupplierOrder.class

default: $(EXECS)

Client.class: Client.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	@-mv $@ ./bin/

ClientOrder.class: ClientOrder.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	@-mv $@ ./bin/

Date.class: Date.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	@-mv $@ ./bin/

Order.class: Order.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	@-mv $@ ./bin/

Panel.class: Panel.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	@-mv $@ ./bin/

Plank.class: Plank.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	@-mv $@ ./bin/

Supplier.class: Supplier.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	@-mv $@ ./bin/

SupplierOrder.class: SupplierOrder.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	@-mv $@ ./bin/

Prize.class: Prize.java
	$(CC) $^
	@-if [ ! -d "bin" ]; then mkdir bin ; fi
	@-mv $@ ./bin/

clean:
	@-/bin/rm -f *.o *~ PI* $(EXECS) *.out core 

veryclean: clean
	@-/bin/rm -f ./bin/*
	@-/bin/rmdir ./bin

.java:
	$(CC) $* $<
