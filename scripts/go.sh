#!/bin/bash
pushd ~/radni_direktorijum/programi/MyAI/scripts
./deploy.sh
./run.sh self.txt &
#./run.sh kaik.txt &
#./run.sh kaik.txt 
#./run.sh e323ai.txt &
#./run.sh agai.txt
#./run.sh rai.txt 

popd
