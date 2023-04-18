import os

remove = True
# remove = False

def listFilder(name):
    items = os.listdir(name)
    for i in items:
        path = os.path.join(name, i)
        if(os.path.isdir(path)):
            listFilder(path)
        elif (i.endswith(".class")):
            print("" + path)
            if remove:
                os.remove(path)

listFilder(os.path.abspath("."))


# import os
# # remove = True
# remove = False
# removeTempCodeRunnerFile = False

# def listFilder(name):
#     items = os.listdir(name)
#     for i in items:
#         path = os.path.join(name, i)
#         if(os.path.isdir(path)):
#             listFilder(path)
#         elif (i.endswith(".class") and remove):
#             print("Removing: " + path)
#             os.remove(path)
#         elif (i.startswith("tempCodeRunnerFile") and removeTempCodeRunnerFile):
#             print("Removing: " + path)

                


# listFilder(os.path.abspath("."))

