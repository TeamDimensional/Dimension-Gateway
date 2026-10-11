from datagen import dawnstone_refinery, mm_casings, nco_fuels

nco_fuels.generate(nco_fuels.fuels, nco_fuels.operators)
dawnstone_refinery.generate_all()
mm_casings.generate_all()
