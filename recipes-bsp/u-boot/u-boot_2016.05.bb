require recipes-bsp/u-boot/u-boot.inc

DEPENDS += "dtc-native"

U-BOOT_VERSION ?= "2016.05"

SRC_URI = "git://git.ti.com/ti-u-boot/ti-u-boot.git;branch=ti-u-boot-${U-BOOT_VERSION} \
	  file://0001-am335x_icev2-separate-board-configuration.patch \
	  "
SRCREV = "6e4de1826316893f896e746b852b98b08fc050f6"

PV = "v${U-BOOT_VERSION}+git${SRCPV}"

SPL_BINARY = "MLO"
UBOOT_SUFFIX = "img"
UBOOT_MACHINE = "am335x_icev2_defconfig"
