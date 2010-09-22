#!/bin/bash

cp $@ ~/.spring/$@
pushd ~/.spring/
spring-multithreaded $@
popd
