#!/bin/bash

cp $@ ~/.spring/$@
pushd ~/.spring/
spring $@
popd
