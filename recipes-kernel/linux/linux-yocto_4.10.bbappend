FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-fs-jffs2-Add-setup-code-for-spi-nor-flash.patch \
	   file://defconfig \
	"

KBRANCH_icev2 = "standard/beaglebone"
SRCREV_machine_icev2 ?= "fe0fb8da3d633d802776081e7ff2df73ff2983f2"
COMPATIBLE_MACHINE_icev2 = "icev2"
LINUX_VERSION_icev2 = "4.10.9"

